package com.project.aggregator.dto;


import com.project.aggregator.domain.Ticker;
import com.project.aggregator.domain.TradeAction;

public record StockTradeRequest(Ticker ticker,
                                Integer price,
                                Integer quantity,
                                TradeAction action) {

}
