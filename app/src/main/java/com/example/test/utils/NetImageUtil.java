package com.example.test.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * PackageName : com.library.utils
 * Author : Ziwen Lan
 * Date : 2017/6/8
 * Time : 11:17
 * 网络图片链接库
 */

public class NetImageUtil {
    /**
     * 轮播图链接
     */
    public static String[] banners = new String[]{
            "http://p4.music.126.net/lBUDkchWeaiWe459dsux8w==/18535567022987582.jpg",
            "http://p4.music.126.net/-3FDSVIBBLxB6XJFd7vyFw==/18936888765354270.jpg",
            "http://p3.music.126.net/rZSdDrE6syZyy4ytVPKvEw==/18928092672332001.jpg",
            "http://p3.music.126.net/OfPTaSENcN17EcayfmZSyQ==/19027048718832592.jpg",
            "http://p4.music.126.net/xWq25joNWUK5es-VjM8DTQ==/19144696463004768.jpg",
            "http://p3.music.126.net/KZI1uUv5Yox5EqoJb3o-5A==/18912699509544778.jpg",
    };

    /**
     * 横向滑动的图片链接
     */
    private static String[] gridPicArray = new String[]{
            "http://p1.music.126.net/KSs9T-FypFuLxu59AOudAA==/109951163808924079.jpg",
            "http://img1.imgtn.bdimg.com/it/u=2172785892,3775136615&fm=26&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=3402703251,3634507809&fm=26&gp=0.jpg",
            "http://p3.music.126.net/OfPTaSENcN17EcayfmZSyQ==/19027048718832592.jpg",
            "http://img1.imgtn.bdimg.com/it/u=3934587203,1631064540&fm=11&gp=0.jpg",
            "http://p3.music.126.net/KZI1uUv5Yox5EqoJb3o-5A==/18912699509544778.jpg",
            "https://gw.alicdn.com/tps/TB1W_X6OXXXXXcZXVXXXXXXXXXX-400-400.png",
            "http://e.hiphotos.baidu.com/image/h%3D300/sign=a9e671b9a551f3dedcb2bf64a4eff0ec/4610b912c8fcc3cef70d70409845d688d53f20f7.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1564618190,473669985&fm=11&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1959736240,4053771765&fm=26&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=449751904,1896322357&fm=26&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2922223417,3070826637&fm=26&gp=0.jpg",
    };

    /**
     *
     * @param posistion 获取第几张图片地址
     * @return
     */
    public static String getPicUrl(int posistion) {
        return gridPicArray[posistion % gridPicArray.length];
    }

    /**
     * @return 横向滑动图片集
     */
    public static List<String> getGridPicList() {
        List<String> gridPicList = new ArrayList<>();
        for (String pic : gridPicArray) {
            gridPicList.add(pic);
        }
        return gridPicList;
    }

    public static List<String> getBannerList(){
        List<String> list = new ArrayList<>();
        for (String pic : banners) {
            list.add(pic);
        }
        return list;
    }

}
