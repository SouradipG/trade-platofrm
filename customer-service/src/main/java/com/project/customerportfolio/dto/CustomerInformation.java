package com.project.customerportfolio.dto;

import java.util.List;

public record CustomerInformation(Integer id,
                                  String name,
                                  Integer balance,
                                  List<Holding> holdings) {
}
