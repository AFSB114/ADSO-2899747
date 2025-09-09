package com.SENA.FlightManagementSystem.Flight.IDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TicketDTO {

    private Long ticketId;
    private String ticketCode;
    private Long flightId;
    private Long passengerId;
    private Long ticketClassId;
    private String seatNumber;
    private BigDecimal price;
    private String status;
    private LocalDateTime purchaseDate;

    public TicketDTO() {
    }

    public TicketDTO(Long ticketId, String ticketCode, Long flightId, Long passengerId,
                     Long ticketClassId, String seatNumber, BigDecimal price,
                     String status, LocalDateTime purchaseDate) {
        this.ticketId = ticketId;
        this.ticketCode = ticketCode;
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.ticketClassId = ticketClassId;
        this.seatNumber = seatNumber;
        this.price = price;
        this.status = status;
        this.purchaseDate = purchaseDate;
    }

    // Getters y Setters
    public Long getTicketId() { return ticketId; }
    public void setTicketId(Long ticketId) { this.ticketId = ticketId; }
    public String getTicketCode() { return ticketCode; }
    public void setTicketCode(String ticketCode) { this.ticketCode = ticketCode; }
    public Long getFlightId() { return flightId; }
    public void setFlightId(Long flightId) { this.flightId = flightId; }
    public Long getPassengerId() { return passengerId; }
    public void setPassengerId(Long passengerId) { this.passengerId = passengerId; }
    public Long getTicketClassId() { return ticketClassId; }
    public void setTicketClassId(Long ticketClassId) { this.ticketClassId = ticketClassId; }
    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDateTime getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDateTime purchaseDate) { this.purchaseDate = purchaseDate; }
}
