package com.example.myapplication.bean;

import com.example.myapplication.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "三只松鼠每日坚果", "麦丽素", "百草味零食大礼包", "枣夹核桃山楂糕", "魔芋爽", "黑巧克力","辣条","鱿鱼仔"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "【三只松鼠每日坚果750g/30包】网红孕妇健康零食混合干果大礼包",
            "澳洲原装进口Maltesers麦提莎麦丽素夹心巧克力豆465g桶装零食",
            "【百草味-巨型零食大礼包/6斤装】网红小吃充饥夜宵囤货一整箱礼",
            "舌里枣夹核桃山楂糕1000g新疆特产加核桃仁独立包装抱抱零食干果",
            "金磨坊魔芋爽辣条魔芋丝香辣味素毛肚网红休闲零食品小吃麻辣儿时",
            "甘滋罗手工松露型黑巧克力纯可可脂散装零食礼盒装送女友生日150g",
            "森吧网红辣条大礼包好吃的小零食排行榜小吃休闲食品麻辣儿时整箱",
            "鱿鱼仔带籽墨鱼仔香辣小乌贼网红小海兔即食海鲜追剧休闲海味零食"

    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {139, 78, 168, 53,18, 39,19,49};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.jianguo, R.drawable.mailisu, R.drawable.baicaowei,
            R.drawable.zaojiahetao, R.drawable.sumaodu, R.drawable.qiaokeli,
            R.drawable.latiao,R.drawable.youyv
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.jian, R.drawable.mai, R.drawable.bai,
            R.drawable.zao, R.drawable.su, R.drawable.qiao,
            R.drawable.la,R.drawable.you
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}