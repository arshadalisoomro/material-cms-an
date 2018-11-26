package pk.edu.cms.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ADMIN on 11/26/2018.
 */
@Data
@Entity
@EqualsAndHashCode
@ToString
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pageId;

    private String pageMenuName;

    private int pagePosition;

    private boolean pageVisibility;

    private String pageContent;

}
