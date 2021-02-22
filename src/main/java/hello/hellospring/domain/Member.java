package hello.hellospring.domain;

/**
 * @AUTHOR        : JUNG JI WOON
 * @DATE-TIME    : 2021-02-23 오전 8:03
 * @NOTE        :
 */
public class Member {

    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
