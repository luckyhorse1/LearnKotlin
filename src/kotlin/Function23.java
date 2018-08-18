package kotlin;


/**
 * kotlin的库中，只有最高Funtion22，所以试着扩展。但是会报错，正因为只有kotlin的标准库，才可以，以kotlin为包名
 * 所以，试着用java写扩展
 */
public interface Function23<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, P23, R> extends Function<R> {
    /**
     * Invokes the function with the specified arguments.
     */
    R invoke(P1 p1, P2 p2, P3 P3, P4 P4, P5 P5, P6 P6, P7 P7, P8 P8, P9 P9, P10 P10, P11 P11, P12 P12, P13 P13, P14 P14, P15 P15, P16 P16, P17 P17, P18 P18, P19 P19, P20 P20, P21 P21, P22 P22, P23 P23);
}
