package com.Xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class RemoteDTO {
	private int remoteId;
	private String name;
	
	public void setRemoteId(int remoteId) {
		this.remoteId=remoteId;
		}
	public int getRemoteId() {
		return remoteId;
	}
	public void setName(String name) {
		this.name=name;
		}
	public String  getName() {
		return name;
	}
	@Override
	public String toString() {
		return
				"RemoteDTO -[id="+this.remoteId+", name="+this.name+"]";
	
	}
	}
	
;
