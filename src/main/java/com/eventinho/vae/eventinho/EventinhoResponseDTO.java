package com.eventinho.vae.eventinho;

public record EventinhoResponseDTO(Long id, String title, String image, String price, String date) {
    public EventinhoResponseDTO(Eventinho eventinho){
        this(eventinho.getId(), eventinho.getTitle(), eventinho.getImage(), eventinho.getPrice(), eventinho.getDate());
    }
}
