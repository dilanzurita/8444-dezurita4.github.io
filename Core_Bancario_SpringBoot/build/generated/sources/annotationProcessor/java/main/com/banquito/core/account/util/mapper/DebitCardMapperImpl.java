package com.banquito.core.account.util.mapper;

import com.banquito.core.account.dto.DebitCardDTO;
import com.banquito.core.account.model.DebitCard;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-06T15:02:28-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 21.0.3 (Eclipse Adoptium)"
)
@Component
public class DebitCardMapperImpl implements DebitCardMapper {

    @Override
    public DebitCardDTO toDTO(DebitCard debitCard) {
        if ( debitCard == null ) {
            return null;
        }

        DebitCardDTO.DebitCardDTOBuilder debitCardDTO = DebitCardDTO.builder();

        if ( debitCard.getId() != null ) {
            debitCardDTO.id( debitCard.getId().intValue() );
        }
        debitCardDTO.clientId( debitCard.getClientId() );
        debitCardDTO.accountId( debitCard.getAccountId() );
        debitCardDTO.cardNumber( debitCard.getCardNumber() );
        debitCardDTO.ccv( debitCard.getCcv() );
        debitCardDTO.expirationDate( debitCard.getExpirationDate() );
        debitCardDTO.cardholderName( debitCard.getCardholderName() );
        debitCardDTO.cardUniqueKey( debitCard.getCardUniqueKey() );
        debitCardDTO.pin( debitCard.getPin() );

        return debitCardDTO.build();
    }
}
