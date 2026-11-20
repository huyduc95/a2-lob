package ca.yorku.cmg.lob.stockexchange.tradingagent;
import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.trader.Trader;
import ca.yorku.cmg.lob.stockexchange.events.Event;

public class StrategyAggressive implements ITradingStrategy {
        private Trader t;
        private StockExchange exc;

    public StrategyAggressive(Trader t, StockExchange exc) {
        this.t = t;
        this.exc = exc;
    }

    @Override 
    public void actOnEvent(Event e, int pos, int price) {
        
       
    }

}
