package com.zerotoheroes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "pack_stat", indexes = {
        @Index(columnList = "creationDate", name = "ix_creationDate"),
        @Index(columnList = "userId", name = "ix_userId"),
        @Index(columnList = "userMachineId", name = "ix_userMachineId"),
        @Index(columnList = "userName", name = "ix_userName"),
        @Index(columnList = "setId", name = "ix_setId"),
        @Index(columnList = "card1Id", name = "ix_card1Id"),
        @Index(columnList = "card1Type", name = "ix_card1Type"),
        @Index(columnList = "card1Rarity", name = "ix_card1Rarity"),
        @Index(columnList = "card2Id", name = "ix_card2Id"),
        @Index(columnList = "card2Type", name = "ix_card2Type"),
        @Index(columnList = "card2Rarity", name = "ix_card2Rarity"),
        @Index(columnList = "card3Id", name = "ix_card3Id"),
        @Index(columnList = "card3Type", name = "ix_card3Type"),
        @Index(columnList = "card3Rarity", name = "ix_card3Rarity"),
        @Index(columnList = "card4Id", name = "ix_card4Id"),
        @Index(columnList = "card4Type", name = "ix_card4Type"),
        @Index(columnList = "card4Rarity", name = "ix_card4Rarity"),
        @Index(columnList = "card5Id", name = "ix_card5Id"),
        @Index(columnList = "card5Type", name = "ix_card5Type"),
        @Index(columnList = "card5Rarity", name = "ix_card5Rarity"),
})
@AllArgsConstructor()
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PackStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    private String userId;
    private String userMachineId;
    private String userName;
    private String setId;
    private String card1Id;
    private String card1Type;
    private String card1Rarity;
    private String card2Id;
    private String card2Type;
    private String card2Rarity;
    private String card3Id;
    private String card3Type;
    private String card3Rarity;
    private String card4Id;
    private String card4Type;
    private String card4Rarity;
    private String card5Id;
    private String card5Type;
    private String card5Rarity;

    private PackStat() {
        // Needed by JPA
    }
}
