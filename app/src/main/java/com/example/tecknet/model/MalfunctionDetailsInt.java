package com.example.tecknet.model;

/**
 * Interface of the malfunction details
 */
public interface MalfunctionDetailsInt  {

    public String getMal_id();

    public void setMal_id(String mal_id);

    public String getExplanation();

    public void setExplanation(String explanation);

    public String getInstitution();

    public void setInstitution(String institution);

    public boolean isIs_open();

    public void setIs_open(boolean is_open);

    public String getProduct_id();

    public void setProduct_id(String product_id);

    public String getTech();

    public void setTech(String tech);

    public String getStatus();

    public void setStatus(String status);

    public double getPayment();

    public void setPayment(double payment);

    public String get_malPicId();

    public void set_malPicId(String id);
}
