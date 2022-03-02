package ss18_solid.open_close_principle.true_design;

/**
 * ta thêm abstract Geometry và chuyển phần tính chu vi, diện tích vào cho các hình
 * như vậy khi thêm 1 lớp mới ta chỉ cần thực thi trong lớp đó mà không ảnh hưởng
 * đến các lớp khác
 */
public abstract class Geometry {
    public abstract double area();
}
