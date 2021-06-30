package com.te.musicplayer.beans;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "status", "message" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MusicFilesResponse implements Serializable {

	private int status;
	private String message;
	private MusicFiles song;
	private List<MusicFiles> list;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MusicFiles getSong() {
		return song;
	}

	public void setSong(MusicFiles song) {
		this.song = song;
	}

	public List<MusicFiles> getList() {
		return list;
	}

	public void setList(List<MusicFiles> list) {
		this.list = list;
	}

}

