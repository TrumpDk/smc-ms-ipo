package com.ibm.fsd.smc.ms.ipo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * IPO Entity
 * Mapping with db table `t_ipo_details`
 */
@Entity
@Table(name = "t_ipo_details")
@Getter
@Setter
@ToString
public class IPOEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "company_id")
    private Integer companyId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "exchange_code")
    private String exchangeCode;

    @Column(name = "exchange_name")
    private String exchangeName;

    @Column(name = "price_per_share")
    private double pricePerShare;

    @Column(name = "share_count")
    private double shareCount;

    @Column(name = "open_date")
    private Date openDate;

    @Column(name = "remark")
    private String remark;
}
