package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;

public class TradingAgentFactory extends AbstractTradingAgentFactory {
   
    @Override
    public TradingAgent createAgent(String type, String style, Trader t, StockExchange e, NewsBoard n) {
        
        TradingAgent agent;
        //Pick the agent type
        if("Institutional".equalsIgnoreCase(type)){
            agent = new TradingAgentInstittional(t, e, n);
        } else if("Retail".equalsIgnoreCase(type)){
            agent = new TradingAgentRetail(t, e, n);
        } else {
            throw new IllegalArgumentException("Unknown agent type: " + type);
        }

        // Pick the trading strategy style

        ITradingStrategy strategy;

        if("Aggresive".equalsIgnoreCase(style)){
            strategy = new StrategyAggressive(t, e);
        } else if("Conservative".equalsIgnoreCase(style)){
            strategy = new StrategyConservative(t, e);
        } else {
            throw new IllegalArgumentException("Unknown strategy style: " + style);
        }
        
        agent.setStrategy(strategy);
        return agent;
    }
    
}
