package com.banquito.core.account.util.mapper;

import com.banquito.core.account.dto.AccountDTO;
import com.banquito.core.account.model.Account;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-06T15:02:28-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDTO toDTO(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDTO.AccountDTOBuilder accountDTO = AccountDTO.builder();

        accountDTO.uniqueId( account.getUniqueId() );
        accountDTO.codeProductType( account.getCodeProductType() );
        accountDTO.codeProduct( account.getCodeProduct() );
        accountDTO.clientId( account.getClientId() );
        accountDTO.codeInternalAccount( account.getCodeInternalAccount() );
        accountDTO.currentBalance( account.getCurrentBalance() );
        accountDTO.availableBalance( account.getAvailableBalance() );
        accountDTO.blockedBalance( account.getBlockedBalance() );

        return accountDTO.build();
    }

    @Override
    public Account toPersistence(AccountDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Account account = new Account();

        account.setUniqueId( dto.getUniqueId() );
        account.setCodeProductType( dto.getCodeProductType() );
        account.setCodeProduct( dto.getCodeProduct() );
        account.setClientId( dto.getClientId() );
        account.setCodeInternalAccount( dto.getCodeInternalAccount() );
        account.setCurrentBalance( dto.getCurrentBalance() );
        account.setAvailableBalance( dto.getAvailableBalance() );
        account.setBlockedBalance( dto.getBlockedBalance() );

        return account;
    }
}
