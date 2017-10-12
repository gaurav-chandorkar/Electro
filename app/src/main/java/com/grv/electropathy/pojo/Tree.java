package com.grv.electropathy.pojo;

/**
 * Created by gaurav on 9/27/17.
 */

public class Tree {

    int id;
    String treeNam = "";
    String commonName = "";
    String remark = "";
    String usedInRemedies = "";
    String family = "";
    String habitats = "";
    String partUsed = "";
    String indication = "";
    String defination = "", description = "";
    String preparation = "";


    public Tree(String treeNam, String commonName, String remark,
                String usedInRemedies, String family, String habitats,
                String partUsed, String indication, String defination,
                String description, String preparation) {

        this.treeNam = treeNam;
        this.commonName = commonName;
        this.remark = remark;
        this.usedInRemedies = usedInRemedies;
        this.family = family;
        this.habitats = habitats;
        this.partUsed = partUsed;
        this.indication = indication;
        this.defination = defination;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setTreeNam(String treeNam) {
        this.treeNam = treeNam;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setUsedInRemedies(String usedInRemedies) {
        this.usedInRemedies = usedInRemedies;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setHabitats(String habitats) {
        this.habitats = habitats;
    }

    public void setPartUsed(String partUsed) {
        this.partUsed = partUsed;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public void setDefination(String defination) {
        this.defination = defination;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getTreeNam() {
        return treeNam;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getRemark() {
        return remark;
    }

    public String getUsedInRemedies() {
        return usedInRemedies;
    }

    public String getFamily() {
        return family;
    }

    public String getHabitats() {
        return habitats;
    }

    public String getPartUsed() {
        return partUsed;
    }

    public String getIndication() {
        return indication;
    }

    public String getDefination() {
        return defination;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }
}
