package com.project.aggregator.dto;


import com.project.aggregator.domain.Ticker;

public record Holding(Ticker ticker,
                      Integer quantity) {
}
