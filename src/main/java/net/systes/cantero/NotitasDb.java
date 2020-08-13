package net.systes.cantero;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tblnotitas")
public class NotitasDb extends PanacheEntity {

    public String titulo;

    public String nota;

    @CreationTimestamp
    public Date createAt;
}
