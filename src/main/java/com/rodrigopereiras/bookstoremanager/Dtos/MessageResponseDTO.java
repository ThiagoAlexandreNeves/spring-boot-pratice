package com.rodrigopereiras.bookstoremanager.Dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MessageResponseDTO {

	private String message;

	public MessageResponseDTO(String message) {
		this.message = message;
	}
	
	
}
