package model;

import lombok.Getter;
import lombok.Setter;

public class ToDo {
    @Getter
    @Setter
    private String title;

    public ToDo(String title) {
        this.title = title;
    }
}
