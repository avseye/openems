package io.openems.backend.metadata.api;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Optional;

import com.google.gson.JsonObject;

public class Edge {
	private final int id;
	private String name;
	private String comment;
	private String producttype;
	private JsonObject jConfig;
	private ZonedDateTime lastMessage = null;
	private ZonedDateTime lastUpdate = null;
	private Integer soc = null;
	private String ipv4 = null;
	private boolean isOnline;

	public Edge(int id, String name, String comment, String producttype, JsonObject jConfig) {
		this.id = id;
		this.name = name;
		this.comment = comment;
		this.producttype = producttype;
		this.jConfig = jConfig;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/*
	 * Marks this Edge as being online. This is called by an event listener.
	 */
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	private Optional<OnSetJsonObject> onSetConfig = Optional.empty();

	public void onSetConfig(OnSetJsonObject listener) {
		this.onSetConfig = Optional.of(listener);
	}

	public void setConfig(JsonObject jConfig) {
		this.jConfig = jConfig;
		if (this.onSetConfig.isPresent()) {
			this.onSetConfig.get().call(jConfig);
		}
	}

	public JsonObject getConfig() {
		return this.jConfig;
	}

	public String getProducttype() {
		return producttype;
	}

	public boolean isOnline() {
		return this.isOnline;
	}

	public JsonObject toJsonObject() {
		JsonObject j = new JsonObject();
		j.addProperty("id", this.id);
		j.addProperty("name", this.name);
		j.addProperty("comment", this.comment);
		j.addProperty("producttype", this.producttype);
		j.addProperty("online", this.isOnline);
		return j;
	}

	@Override
	public String toString() {
		return "Edge [id=" + id + ", name=" + name + ", comment=" + comment + ", producttype=" + producttype
				+ ", isOnline=" + isOnline + "]";
	}

	private Optional<OnSetZonedDateTime> onSetLastMessage = Optional.empty();

	public void onSetLastMessage(OnSetZonedDateTime listener) {
		this.onSetLastMessage = Optional.of(listener);
	}

	public void setLastMessage() {
		this.lastMessage = ZonedDateTime.now(ZoneOffset.UTC);
		if (this.onSetLastMessage.isPresent()) {
			this.onSetLastMessage.get().call(this.lastMessage);
		}
	}

	private Optional<OnSetZonedDateTime> onSetLastUpdate = Optional.empty();

	public void onSetLastUpdate(OnSetZonedDateTime listener) {
		this.onSetLastUpdate = Optional.of(listener);
	}

	public void setLastUpdate() {
		this.lastUpdate = ZonedDateTime.now(ZoneOffset.UTC);
		if (this.onSetLastUpdate.isPresent()) {
			this.onSetLastUpdate.get().call(this.lastUpdate);
		}
	}

	private Optional<OnSetInteger> onSetSoc = Optional.empty();

	public void onSetSoc(OnSetInteger listener) {
		this.onSetSoc = Optional.of(listener);
	}

	public void setSoc(int soc) {
		this.soc = soc;
		if (this.onSetSoc.isPresent()) {
			this.onSetSoc.get().call(this.soc);
		}
	}

	private Optional<OnSetString> onSetIpv4 = Optional.empty();

	public void onSetIpv4(OnSetString listener) {
		this.onSetIpv4 = Optional.of(listener);
	}

	public void setIpv4(String ipv4) {
		this.ipv4 = ipv4;
		if (this.onSetIpv4.isPresent()) {
			this.onSetIpv4.get().call(this.ipv4);
		}
	}
}
