package com.viratech.itsm_api.ticket.presentation;

import com.viratech.itsm_api.ticket.application.TicketService;
import com.viratech.itsm_api.ticket.application.dto.TicketRequest;
import com.viratech.itsm_api.ticket.application.dto.TicketResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tickets")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService service;

    @PostMapping
    public ResponseEntity<TicketResponse> createTicket(@Valid @RequestBody TicketRequest request){
        TicketResponse response = service.createTicket(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
