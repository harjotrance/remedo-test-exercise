

SELECT * FROM `transactions` WHERE `user_id` = u1;
SELECT SUM(remedo_commission) FROM transactions WHERE user_id ='u2';
SELECT user_id FROM `user_extra_info` WHERE whatsapp_disabled ='1';
SELECT user_id FROM `user_extra_info` WHERE whatsapp_disabled !='1';
SELECT * FROM users JOIN transactions ON user_id = t.user_id JOIN user_extra_info ue ON ue.user_id = t.user_id;