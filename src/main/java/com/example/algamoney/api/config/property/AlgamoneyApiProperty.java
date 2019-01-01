package com.example.algamoney.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="algamoney" /*nome para configuracao: para ser usado no application.properties... algamoney.seguranca.enable-https*/) 
public class AlgamoneyApiProperty {
	
	private String origemPermitida = "http://localhost:8000";
	private final Seguranca seguranca = new Seguranca();
	
	
	
	public String getOrigemPermitida() {
		return origemPermitida;
	}
	
	public void setOrigemPermitida(String origemPermitida) {
		this.origemPermitida = origemPermitida;
	}


	public Seguranca getSeguranca() {
		return seguranca;
	}


	
	
	
	/*---------------------------------------------------------------------------------*/

	
	//é possivel agrupar por temas.... criando subclasses
	public static class Seguranca {
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
	}
}
