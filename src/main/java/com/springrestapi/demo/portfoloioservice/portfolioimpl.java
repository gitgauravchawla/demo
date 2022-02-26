package com.springrestapi.demo.portfoloioservice;

import com.springrestapi.demo.entity.portfolio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class portfolioimpl implements portfolioservice{

    List<portfolio> list;

    public portfolioimpl() {
        list=new ArrayList<>();
        list.add(new portfolio("Gaurav","30","vitamin d3","as","500000"));
    }




    @Override
    public portfolio addPortfolio(portfolio portfolio) {
        list.add(portfolio);
        return portfolio;
    }

    @Override
    public String deletePortfolio(String name) {

        list.removeIf(e -> e.getName().equals(name));
        return null;
    }

    @Override
    public List<portfolio> getportfolio() {
        return list;
    }

    public List<portfolio> updateportfolio(long portfId){ return null;
    }
}
