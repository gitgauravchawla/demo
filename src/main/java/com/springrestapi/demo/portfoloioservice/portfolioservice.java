package com.springrestapi.demo.portfoloioservice;

import java.util.List;
import com.springrestapi.demo.entity.portfolio;

public interface portfolioservice {
    public portfolio addPortfolio(portfolio portfId);
    public String deletePortfolio(String name);
    public List<portfolio> getportfolio();

}
