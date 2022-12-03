package ee.valiit.back_3nurka.domain.bike_order;

import ee.valiit.back_3nurka.domain.bike.Bike;
import ee.valiit.back_3nurka.domain.bike_status.BikeStatus;
import ee.valiit.back_3nurka.domain.order.Order;
import ee.valiit.back_3nurka.domain.package_field.PackageField;
import ee.valiit.back_3nurka.domain.work_type.WorkType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "bike_order")
public class BikeOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bike_id", nullable = false)
    private Bike bike;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "work_type_id", nullable = false)
    private WorkType workType;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bike_status_id", nullable = false)
    private BikeStatus bikeStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "package_id")
    private PackageField packageField;

    @NotNull
    @Column(name = "date_from", nullable = false)
    private LocalDate dateFrom;

    @Column(name = "date_to")
    private LocalDate dateTo;

    @Size(max = 1000)
    @Column(name = "tech_comment", length = 1000)
    private String techComment;

    @Size(max = 1000)
    @Column(name = "customer_comment", length = 1000)
    private String customerComment;

}