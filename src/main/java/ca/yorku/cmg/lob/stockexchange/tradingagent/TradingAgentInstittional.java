package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;
public class TradingAgentInstittional extends TradingAgent {
    public TradingAgentInstittional(Trader t, StockExchange e, NewsBoard n) {
        super(t, e, n);
    }
    
}
