select
    P.`*`,U.name
from wanted_posts P
	INNER JOIN users U
	ON P.user_id=U.user_id
