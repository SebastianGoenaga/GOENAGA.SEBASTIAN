package edu.eci.pdsw.persistence.mybatisimpl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.persistence.CommentDAO;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.CommentMapper;


public class MyBatisCommentDAO implements CommentDAO {

	@Inject
	CommentMapper commentMapper;

	@Override
	public List<Comment> loadOffensiveLanguageComments() throws PersistenceException {
		return commentMapper.searchOffensiveLanguageComments();
	}
	

}
