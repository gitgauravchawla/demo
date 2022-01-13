package com.springrestapi.demo.portfoloioservice;

import java.util.List;
import com.springrestapi.demo.entity.portfolio;

public interface portfolioservice {
    public String addPortfolio(long portfId);
    public String deletePortfolio(long portfId);
    public List<portfolio> getportfolio();

}
