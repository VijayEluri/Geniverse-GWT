package org.concord.geniverse.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.IsSerializable;

public class JSOrganism extends JavaScriptObject implements IOrganism, Serializable, IsSerializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static native JSOrganism fromJSONString(String jsonString) /*-{
		return eval('('+jsonString+')');
	}-*/;

	public native String getAlleles() /*-{
		return this.alleles;
	}-*/;

	public native String getImageURL() /*-{
		return this.imageURL;
	}-*/;

	public native String getName() /*-{
		return this.name_0;
	}-*/;

	public native int getSex() /*-{
		return this.sex;
	}-*/;

	// Not implemented yet
	public native ArrayList<String> getCharacteristics();

	// Not implemented yet
	public native HashMap<String, Object> getMetaInfo();
	
	public void setAlleles(String alleles) {
		// TODO Auto-generated method stub

	}

	public void setCharacteristics(ArrayList<String> characteristics) {
		// TODO Auto-generated method stub

	}

	public void setImageURL(String imageURL) {
		// TODO Auto-generated method stub

	}

	public void setMetaInfo(HashMap<String, Object> metaInfo) {
		// TODO Auto-generated method stub

	}

	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	public void setSex(int sex) {
		// TODO Auto-generated method stub

	}

}
