select
    P.`*`,U.name
from wanted_posts P
	INNER JOIN users U
	ON P.user_id=U.user_id
	where wanted_post_id = /*id*/1
	/*%if id*/ != wanted_post_id
	/*%end*/