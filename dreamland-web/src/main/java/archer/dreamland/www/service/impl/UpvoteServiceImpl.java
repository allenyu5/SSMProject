package archer.dreamland.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import archer.dreamland.www.dao.UpvoteMapper;
import archer.dreamland.www.entity.Upvote;
import archer.dreamland.www.service.UpvoteService;

/**
 * Created by wly on 2017/12/15.
 */
@Service
public class UpvoteServiceImpl implements UpvoteService {
    @Autowired
    private UpvoteMapper upvoteMapper;


    public Upvote findByUidAndConId(Upvote upvote) {
      return  upvoteMapper.selectOne( upvote);
    }

    public int add(Upvote upvote) {
        return upvoteMapper.insert( upvote );
    }

    public Upvote getByUid(Upvote upvote) {
        return null;
    }

    public void update(Upvote upvote) {
        upvoteMapper.updateByPrimaryKey( upvote );
    }
}
