package com.viratech.itsm_api.ticket.application;

import com.viratech.itsm_api.customer.application.CustomerMapper;
import com.viratech.itsm_api.ticket.application.dto.TicketRequest;
import com.viratech.itsm_api.ticket.application.dto.TicketResponse;
import com.viratech.itsm_api.ticket.domain.Ticket;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class TicketMapper {

    private final CustomerMapper mapper;

    public TicketResponse toDto(Ticket entity){

        LocalDateTime createdAt = entity.getCreatedAt() != null
                ? entity.getCreatedAt()
                : LocalDateTime.now();

        LocalDateTime updatedAt = entity.getUpdateAt() != null
                ? entity.getUpdateAt()
                : LocalDateTime.now();

        return new TicketResponse(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPriority(),
                entity.getCategory(),
                mapper.toDtoTicketResponse(entity.getCustomer()),
                createdAt,
                updatedAt
        );
    }

    public Ticket toEntity(TicketRequest request){
        return Ticket.builder()
                .title(request.title())
                .description(request.description())
                .priority(request.priority())
                .category(request.category())
                .build();
    }
}
