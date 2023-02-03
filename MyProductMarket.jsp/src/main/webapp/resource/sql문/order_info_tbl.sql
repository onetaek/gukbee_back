CREATE TABLE `my_product_market`.`order_info`
(
    `orderNo`        varchar(50),                              # 주문 번호
    `memberId`       varchar(50),                              # 주문자 아이디
    `orderName`      varchar(20),                              # 주문자 이름
    `orderTel`       varchar(20),                              # 주문자 전화번호
    `orderEmail`     varchar(30),                              # 주문자 이메일

    `receiveName`    varchar(20),                              # 받는이 이름
    `receiveTel`     varchar(20),                              # 받는이 전화번호
    `receiveAddress` varchar(200),                             # 받는이 주소

    `payMethod`      varchar(20) null     default null,        # 결제 방법 선택
    `carryNo`        varchar(20) null     default null,        # 운반 번호
    `orderStep`      varchar(20) not null default 'orderFail', # 주문 단계

    `dateOrder`      datetime    not null,                     # 주문 일
    `datePay`        datetime    null     default null,        # 입금 일
    `dateCarry`      datetime    null     default null,        # 배송 일
    `dateDone`       date        null     default null,        # 배송 완료 일

    constraint primary key (`orderNo`)
);