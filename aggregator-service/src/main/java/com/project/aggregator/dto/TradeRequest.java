package com.project.aggregator.dto;

import com.project.aggregator.domain.Ticker;
import com.project.aggregator.domain.TradeAction;

public record TradeRequest(Ticker ticker,
                           TradeAction action,
                           Integer quantity) {
}
