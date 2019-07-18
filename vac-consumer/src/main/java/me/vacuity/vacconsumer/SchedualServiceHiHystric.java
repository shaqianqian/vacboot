package me.vacuity.vacconsumer;

import org.springframework.stereotype.Component;

/**
 * description:
 *
 * @author vacuity
 * @create 2019-07-17 16:27
 **/


@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
