DROP SEQUENCE board_seq;
DROP TABLE basket;
DROP TABLE board;
DROP TABLE orderdetails;
DROP TABLE ordering;
DROP TABLE product;
DROP TABLE basket;
DROP TABLE wishlist;
DROP TABLE review;
DROP TABLE productinventory;
DROP TABLE member;

---------------------------------------------------------------------------------------------------------------------

CREATE SEQUENCE member_seq; -- 멤버 번호
CREATE SEQUENCE prod_seq; -- 제품 번호
CREATE SEQUENCE basket_seq; -- 장바구니 번호
CREATE SEQUENCE wishlist_seq; -- 위시리스트 번호


CREATE TABLE member
(   member_no      NUMBER          NOT NULL, -- 멤버 번호
    member_id      VARCHAR2(50)    NOT NULL, -- 멤버 아이디
    member_pw      VARCHAR2(30)    NOT NULL, -- 멤버 비밀번호
    member_nm      VARCHAR2(30)    NOT NULL, -- 멤버 이름
    address        VARCHAR2(200)   NOT NULL, -- 주소
    email          VARCHAR2(100)   NOT NULL, -- 이메일
    phone          VARCHAR2(30)    NOT NULL, -- 전화번호
    creation_date  DATE            NULL,  -- 가입날짜
    PRIMARY KEY(member_no)                           
);
    
       
CREATE TABLE product(
prod_no NUMBER,              -- 제품번호
prod_name VARCHAR2(100),     -- 제품이름
prod_price NUMBER,           -- 제품가격
prod_category VARCHAR2(200), -- 제품 카테고리
prod_image1 VARCHAR2(500),   -- 제품 이미지1
prod_image2 VARCHAR2(500),   -- 제품 이미지2
prod_image3 VARCHAR2(500),   -- 제품 이미지3
prod_image4 VARCHAR2(500),   -- 제품 이미지4
prod_exp VARCHAR2(600),      -- 제품 설명
prod_code VARCHAR2(50),      -- 제품 코드
thumbnail VARCHAR2(500),     -- 제품 썸네일
PRIMARY KEY(prod_no)
);

ALTER TABLE product ADD prod_category2 VARCHAR(20);
ALTER TABLE product MODIFY prod_price VARCHAR2(100);
ALTER TABLE product ADD prod_star number;

Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'남자 상의 test1','123,000 원','top','mentop1.png',5,'men');
Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'남자 하의 test1','99,000 원','bottom','menbottom1.jpg',4,'men');
Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'나이키 머큐리얼 슈퍼플라이 10 엘리트 일렉트릭','339,000 원','shoes','nikefootball.png',3,'men');
Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'여자 상의 test1','209,000 원','top','womentop1.png',2,'women');
Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'여자 하의 test1','109,000 원','bottom','womenbottom1.png',1,'women');
Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'여자 신발 test1','139,000 원','shoes','nikeairjordan.jpg',5,'women');
Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'어린이 상의 test1','109,000 원','top','kidtop1.jpg',5,'kids');
Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'어린이 하의 test1','59,000 원','bottom','kidbottom1.png',3,'kids');
Insert into PRODUCT (PROD_NO,PROD_NAME,PROD_PRICE,PROD_CATEGORY,THUMBNAIL,PROD_STAR,PROD_CATEGORY2) 
values (prod_seq.NEXTVAL,'어린이 신발 test1','29,000 원','shoes','nikeairforce.png',4,'kids');


CREATE TABLE basket(
cart_no NUMBER,              -- 장바구니 번호
prod_no NUMBER,              -- 제품번호
member_no NUMBER,            -- 멤버번호
basket_date DATE,            -- 장바구니 넣은 날짜
product_color VARCHAR2(20),  -- 장바구니 제품 색
product_size VARCHAR2(20),   -- 장바구니 제품 사이즈
product_quantity NUMBER,     -- 장바구니 제품 양
PRIMARY KEY(cart_no),
FOREIGN KEY(prod_no) REFERENCES product(prod_no),  -- 제품번호 외래키 참조
FOREIGN KEY(member_no) REFERENCES member(member_no) -- 멤버번호 외래키 참조
);


CREATE TABLE wishlist(
wish_no NUMBER,      -- 위시리스트 번호
prod_no NUMBER,      -- 제품 번호
member_no NUMBER,    -- 멤버 번호
wish_date DATE,      -- 위시리스트 날짜
PRIMARY KEY(wish_no),
FOREIGN KEY(prod_no) REFERENCES product(prod_no),  -- 제품번호 외래키 참조
FOREIGN KEY(member_no) REFERENCES member(member_no) -- 멤버번호 외래키 참조
);

