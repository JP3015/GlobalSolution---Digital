package br.com.fiap.bean;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletContext;

import org.primefaces.model.file.UploadedFile;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;

@Named
@RequestScoped
public class SetupBean {

	private Setup setup = new Setup();
	
	private UploadedFile image;
	
	@Inject 
	private SetupDao dao;
	
	public String save() throws IOException {
		System.out.println(this.setup);
		
		ServletContext servletContext = (ServletContext) FacesContext
			.getCurrentInstance()
			.getExternalContext()
			.getContext();
		String path = servletContext.getRealPath("/");
		
		FileOutputStream out = 
				new FileOutputStream(path + "\\images\\" + image.getFileName());
		out.write(image.getContent());
		out.close();
		
		setup.setImagePath("\\images\\" + image.getFileName());
		
		dao.create(setup);
		
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Setup cadastrado com sucesso"));
		
		return "setups";
	}
	
	public List<Setup> getAll(){
		return dao.listAll();
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

	public UploadedFile getImage() {
		return image;
	}

	public void setImage(UploadedFile image) {
		this.image = image;
	}

}
