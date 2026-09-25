package com.viratech.itsm_api.tickethistory.domain;

import com.viratech.itsm_api.enums.Status;
import com.viratech.itsm_api.ticket.domain.Ticket;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "ticket_history")
public class TicketHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @Column(name = "old_status")
    @Enumerated(EnumType.STRING)
    private Status oldStatus;

    @Column(name = "new_status")
    @Enumerated(EnumType.STRING)
    private Status newStatus;

    @Column(name = "change_at")
    private LocalDateTime changeAt;
}
