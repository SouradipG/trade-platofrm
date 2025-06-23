package com.project.customerportfolio.dto;

import com.project.customerportfolio.domain.Ticker;
import com.project.customerportfolio.domain.TradeAction;

public record StockTradeRequest(Ticker ticker,
                                Integer price,
                                Integer quantity,
                                TradeAction action) {

    public Integer totalPrice(){
        return price * quantity;
    }

}
