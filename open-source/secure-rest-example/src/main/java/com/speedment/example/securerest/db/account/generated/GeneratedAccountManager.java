package com.speedment.example.securerest.db.account.generated;

import com.speedment.example.securerest.db.account.Account;
import com.speedment.runtime.core.manager.Manager;
import javax.annotation.Generated;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.example.securerest.db.account.Account} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedAccountManager extends Manager<Account> {
    
    @Override
    default Class<Account> getEntityClass() {
        return Account.class;
    }
}