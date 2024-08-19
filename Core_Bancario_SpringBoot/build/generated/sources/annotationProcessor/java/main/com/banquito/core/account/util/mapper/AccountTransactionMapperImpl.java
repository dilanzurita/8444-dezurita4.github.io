package com.banquito.core.account.util.mapper;

import com.banquito.core.account.dto.AccountTransactionDTO;
import com.banquito.core.account.model.AccountTransaction;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-06T15:02:28-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class AccountTransactionMapperImpl implements AccountTransactionMapper {

    @Override
    public AccountTransactionDTO toDTO(AccountTransaction accountTransaction) {
        if ( accountTransaction == null ) {
            return null;
        }

        AccountTransactionDTO.AccountTransactionDTOBuilder accountTransactionDTO = AccountTransactionDTO.builder();

        accountTransactionDTO.accountId( accountTransaction.getAccountId() );
        accountTransactionDTO.codeChannel( accountTransaction.getCodeChannel() );
        accountTransactionDTO.amount( accountTransaction.getAmount() );
        accountTransactionDTO.debitorAccount( accountTransaction.getDebitorAccount() );
        accountTransactionDTO.creditorAccount( accountTransaction.getCreditorAccount() );
        accountTransactionDTO.transactionType( accountTransaction.getTransactionType() );
        accountTransactionDTO.reference( accountTransaction.getReference() );
        accountTransactionDTO.parentTransactionKey( accountTransaction.getParentTransactionKey() );
        accountTransactionDTO.createDate( accountTransaction.getCreateDate() );
        accountTransactionDTO.status( accountTransaction.getStatus() );

        return accountTransactionDTO.build();
    }

    @Override
    public AccountTransaction toPersistence(AccountTransactionDTO accountTransactionDTO) {
        if ( accountTransactionDTO == null ) {
            return null;
        }

        AccountTransaction accountTransaction = new AccountTransaction();

        accountTransaction.setAccountId( accountTransactionDTO.getAccountId() );
        accountTransaction.setCodeChannel( accountTransactionDTO.getCodeChannel() );
        accountTransaction.setTransactionType( accountTransactionDTO.getTransactionType() );
        accountTransaction.setReference( accountTransactionDTO.getReference() );
        accountTransaction.setAmount( accountTransactionDTO.getAmount() );
        accountTransaction.setCreditorAccount( accountTransactionDTO.getCreditorAccount() );
        accountTransaction.setDebitorAccount( accountTransactionDTO.getDebitorAccount() );
        accountTransaction.setCreateDate( accountTransactionDTO.getCreateDate() );
        accountTransaction.setParentTransactionKey( accountTransactionDTO.getParentTransactionKey() );
        accountTransaction.setStatus( accountTransactionDTO.getStatus() );

        return accountTransaction;
    }

    @Override
    public List<AccountTransactionDTO> toDTOList(List<AccountTransaction> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AccountTransactionDTO> list = new ArrayList<AccountTransactionDTO>( entities.size() );
        for ( AccountTransaction accountTransaction : entities ) {
            list.add( toDTO( accountTransaction ) );
        }

        return list;
    }
}
