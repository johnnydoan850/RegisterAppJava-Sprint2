package edu.uark.registerapp.models.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import edu.uark.registerapp.models.entities.TransactionEntity;

public class Transaction extends ApiResponse {
  private UUID id;
  public UUID getId() {
    return this.id;
  }
  public Transaction setId(final UUID id) {
    this.id = id;
    return this;
  }

  private UUID cashierId;

  public UUID getCashierId() {
    return this.cashierId;
  }

  public Transaction setCashierId(final UUID cashierId) {
    this.cashierId = cashierId;
    return this;
  }

  private long total;

  public long getTotal() {
    return this.total;
  }

  public Transaction setTotal(final long total) {
    this.total = total;
    return this;
  }

  private int transactionType;

  public int getTransactionType() {
    return this.transactionType;
  }

  public Transaction setTransactionType(final int transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  private UUID referenceId;

  public UUID getReferenceId() {
    return this.referenceId;
  }

  public Transaction setReferenceId(final UUID referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  private String createdOn;

  public String getCreatedOn() {
    return this.createdOn;
  }

  public Transaction setCreatedOn(final String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  public Transaction setCreatedOn(final LocalDateTime createdOn) {
    this.createdOn =
        createdOn.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

    return this;
  }

  public Transaction() {
    super();

    this.id = new UUID(0, 0);
    this.cashierId = new UUID(0, 0);
    this.total = 0L;
    this.transactionType = -1;
    this.referenceId = new UUID(0, 0);
    this.setCreatedOn(LocalDateTime.now());
  }

  public Transaction(final TransactionEntity transactionEntity) {
    super(false);

    this.id = transactionEntity.getId();
    this.cashierId = transactionEntity.getCashierId();
    this.total = transactionEntity.getTotal();
    this.transactionType = transactionEntity.getType();
    this.referenceId = transactionEntity.getReferenceId();
    this.setCreatedOn(transactionEntity.getCreatedOn());
  }
}
