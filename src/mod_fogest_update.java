package net.minecraft.src;
import java.net.*;
import java.io.*;
public class mod_fogest_update {
	private double version = 1.07;
	private double webVersion = 0.0;
	private boolean updated;
	private String inputLine;
	private String message = "FogHelper by foghead";
	public mod_fogest_update() {
		
	}
	
	    public void checkUpdate() throws Exception {
	        URL fogcode = new URL("http://code.fogest.net16.net/version.html");
	        URLConnection yc = fogcode.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                yc.getInputStream()));
	        

	        inputLine = in.readLine();
	        webVersion = Double.parseDouble(inputLine);
	        in.close();
	    }
	    public String getVersion() {
	    	if(webVersion == 0.0){
	    		message = "";
	    	}
	    	else if(version == webVersion) {
	    		updated = true;
	    		message = "You are using the latest version!";
	    	}else if(version != webVersion) {
	    		updated = false;;
	    		message = "Mod Outdated! New Version: www.bit.ly/foghelper";
	    	}
	    	return message;
	    }
}
