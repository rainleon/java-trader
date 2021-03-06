package trader.service.trade.ctp;

import trader.common.beans.BeansContainer;
import trader.common.beans.Discoverable;
import trader.service.trade.Account;
import trader.service.trade.TxnSession;
import trader.service.trade.TxnSessionFactory;
import trader.service.trade.spi.TxnSessionListener;

@Discoverable(interfaceClass = TxnSessionFactory.class, purpose = "ctp")
public class CtpTxnSessionFactory implements TxnSessionFactory {

    @Override
    public TxnSession create(BeansContainer beansContainer, Account account, TxnSessionListener listener) {
        return new CtpTxnSession(beansContainer, account, listener);
    }

}
