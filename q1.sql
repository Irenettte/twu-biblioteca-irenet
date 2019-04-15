SELECT member.name
FROM member
LEFT JOIN checkout_item ON member.id = checkout_item.member_id
GROUP BY member.name
HAVING COUNT()>1;