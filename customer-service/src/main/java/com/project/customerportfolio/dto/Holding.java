package com.project.customerportfolio.dto;

import com.project.customerportfolio.domain.Ticker;

public record Holding(Ticker ticker,
                      Integer quantity) {
}
