package com.example.speedwayspring2.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class InventoryTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String EPC;
    private short antNum;
    private short chnNum;
//
//    public InventoryTag() {
//    }
//
//    public InventoryTag(Long ID, String EPC, short antNum, short chnNum) {
//        this.ID = ID;
//        this.EPC = EPC;
//        this.antNum = antNum;
//        this.chnNum = chnNum;
//    }
//
//    public void setID(Long ID) {
//        this.ID = ID;
//    }
//
//    public void setEPC(String EPC) {
//        this.EPC = EPC;
//    }
//
//    public void setAntNum(short antNum) {
//        this.antNum = antNum;
//    }
//
//    public void setChnNum(short chnNum) {
//        this.chnNum = chnNum;
//    }
//
//    public Long getID() {
//        return ID;
//    }
//
//    public String getEPC() {
//        return EPC;
//    }
//
//    public short getAntNum() {
//        return antNum;
//    }
//
//    public short getChnNum() {
//        return chnNum;
//    }
}
